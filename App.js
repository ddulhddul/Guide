import React, {Component} from 'react';
import {
  AppRegistry,
  StyleSheet,
  Text,
  View,
  TextInput,
  TouchableOpacity
} from 'react-native';
import Ionicons from 'react-native-vector-icons/Ionicons'


export default class App extends React.Component {

  render() {
    return (
      <Todo />
    );
  }
}

class Todo extends Component {
  componentWillMount() {
    this.setState({
      inputText: '',
      todos: [],
    })
  }

  addTodo() {
    let todoItem = {
      context: this.state.inputText,
      complete: false
    }
    let todos = this.state.todos
    todos.push(todoItem)
    this.setState({
      inputText: '',
      todos: todos,
    })
  }

  completeTodo(index) {
    let todos = this.state.todos
    todos[index].complete = !todos[index].complete
    this.setState({
      todos: todos,
    })
  }

  deleteTodo (index) {
    let todos = this.state.todos
    todos.splice(index, 1)
    this.setState({
      todos: todos,
    })
  }

  render() {
    return (
      <View style={styles.container}>
        <Ionicons size={35} name='ios-person-outline' color="#000000" />
        <TextInput
          style={{height: 40,borderColor: 'gray', borderWidth: 1}}
          onChangeText={(text) => {
            this.setState({inputText: text})
          }}
          value={this.state.inputText}
          />
        <TouchableOpacity onPress={this.addTodo.bind(this)}>
          <Text>
            add Todo
          </Text>
        </TouchableOpacity>
        {
          this.state.todos.map((todoItem, index)=> {
            return (
              <View key={index} style={{flexDirection: 'row'}}>
                <Text style={todoItem.complete ? {textDecorationLine: 'line-through'} : {textDecorationLine: 'none'}}>
                  {todoItem.context}
                </Text>
                <TouchableOpacity onPress={this.completeTodo.bind(this, index)}>
                  <Text>{todoItem.complete ? "---complete" : "---incomplete" }</Text>
                </TouchableOpacity>
                <TouchableOpacity onPress={this.deleteTodo.bind(this, index)}>
                  <Text>     delete </Text>
                </TouchableOpacity>
              </View>
            )
          })
        }
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },
});
